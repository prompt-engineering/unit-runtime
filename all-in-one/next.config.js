/** @type {import('next').NextConfig} */
const nextConfig = {
  experimental: {
    appDir: true,
  },
  headers: async () => {
    return[
      {
        "source": "/(.*)",
        "headers": [
          {
            "key": "Cross-Origin-Embedder-Policy",
            "value": "require-corp"
          },
          {
            "key": "Cross-Origin-Opener-Policy",
            "value": "same-origin"
          }
        ]
      }
    ]
  },

  // https://github.com/vercel/next.js/issues/33863#issuecomment-1140518693

}

module.exports = nextConfig
