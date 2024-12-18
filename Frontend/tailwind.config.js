/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      colors: {
        'lightblue': '#1488D8',
        'darkblue': '#030391'
      }
    },
  },
  plugins: [],
}

