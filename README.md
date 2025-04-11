# 🏋️‍♂️ MyFit – Fitness App

**MyFit** is a modern and minimal fitness tracking web application built using **TypeScript**, **HTML**, and **CSS**. Designed with performance and accessibility in mind, the app helps users log workouts, track progress, and stay motivated on their fitness journey.

✅ The web app is also converted into a fully functional **Android app** using **WebView Activity**.

---

## 🚀 Features

- 📅 **Workout Logging** – Easily add exercises, sets, and weights
- 📊 **Dashboard Stats** – Track total workouts, exercises, and weight lifted
- ⚡ **Quick Start Templates** – Start training with predefined workout routines
- 🤖 **AI Trainer** – Smart workout recommendations (WIP)
- 👣 **Step Tracker** – Count and visualize daily steps
- 📱 **Android App Integration** – Deployed as a WebView app for Android

---

## 🧰 Tech Stack

| Technology   | Usage                          |
|--------------|--------------------------------|
| TypeScript   | Core logic and interactivity   |
| HTML & CSS   | Structure and styling          |
| React        | UI components and routing      |
| React Router | Navigation                     |
| Lucide Icons | Clean, lightweight icons       |
| Android WebView | Android app integration     |

---

## 📱 Android Integration

This app is seamlessly wrapped in an Android application using **WebView**:

- Built using **Android Studio**
- Uses **WebViewActivity** to load the web app
- Enables responsive, mobile-friendly interaction

```kotlin
webView.webViewClient = WebViewClient()
webView.settings.javaScriptEnabled = true
webView.loadUrl("https://your-deployed-webapp.com")
--------------------------------------------------------------------------------------------------------------------------

🔐 Authentication
✨ Login page using email & password form

🔒 Access to the main dashboard is protected via simple token-based logic


📂 #Project Strucutre

myfit/
├── public/
├── src/
│   ├── components/
│   │   ├── Login.tsx
│   │   ├── WorkoutForm.tsx
│   │   ├── WorkoutList.tsx
│   │   └── ...
│   ├── App.tsx
│   ├── types.ts
│   └── main.tsx
├── android/ (for WebView integration)
└── README.md
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


🛠️ Installation & Setup

# Clone the repo
git clone https://github.com/Just-vikas91/myfit.git
cd myfit

# Install dependencies
npm install

# Run locally
npm run dev

=========================================================================================================


🌐 Deploy & Publish
Deploy web version to platforms like Vercel, Netlify, or GitHub Pages

Publish the Android version via Google Play Store

✍️ Author
Made with ❤️ by Vikas Patel
GitHub: Just-vikas91

📃 License
This project is open-source and available under the MIT License.

---

Let me know if you want me to include:
- Live demo link
- QR code for Android APK
- Badges (build, license, version)
