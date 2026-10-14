# Modern Coffee App Using Jetpack Compose and Kotlin
My First JetPack Compose Project

In this project i am going to implement my learning which i have learned so far and build a real app using Jetpack Compose. This is my first complete Jetpack Compose Project without back-end integration for now. Maybe when i will cover further topics and learn about back-end then i will think to implement that.

This project is inspired by neat roots Modern Coffee App on Youtube.

# ☕ CoffeeApp — Android Coffee Shopping App

A coffee shopping app built with **Kotlin and Jetpack Compose**, focused on modern Android UI development, navigation, and creating a smooth user experience.

This project is part of my journey toward becoming an Android developer, where I am learning by building practical applications rather than just studying individual concepts.

## 📱 Features

- **Coffee Product UI** — Display coffee products using custom-designed product cards.
- **Product Navigation** — Navigate between screens and pass product information to detail screens.
- **Product Details** — Present information about individual coffee products.
- **Category-Based UI** — Organize the coffee browsing experience around product categories.
- **Cart Interface** — Build and refine cart-related UI and quantity controls.
- **Bottom Navigation** — Provide navigation destinations for Home, Cart, Liked, and Profile.
- **Custom UI Styling** — Use colors, rounded corners, spacing, alignment, and modifiers to create a consistent interface.
- **Image Optimization** — Reduce product image sizes to improve app performance and scrolling smoothness.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Kotlin | Primary programming language |
| Jetpack Compose | Declarative Android UI |
| Navigation Compose | Navigation between app screens |
| Material 3 | UI components and styling |
| Gradle | Project configuration and build management |
| Android Studio | Development and debugging |

## ⚡ Performance Improvements

During development, I noticed that large product images were affecting the app's smoothness.

I reduced the image asset sizes to make the app lighter to render and improve the browsing experience. After optimizing the images, I observed a substantial improvement in perceived scrolling smoothness on my device.

This taught me that performance is not just about writing efficient Kotlin code; asset sizes and UI rendering also matter.

## 🖼️ Screenshots

Screenshots of the application will be added here as development progresses.
Welcome Screen : <img width="1080" height="2460" alt="WelcomeScreen" src="https://github.com/user-attachments/assets/3ea93b98-feb5-4531-8628-d5047c128a77" />
Home Screen : <img width="1080" height="2460" alt="HomeScreen" src="https://github.com/user-attachments/assets/6a35ed81-92f8-4e54-900f-6d7ac27ee8a3" />
Cart Section : <img width="1080" height="2460" alt="CartScreenWithPayment" src="https://github.com/user-attachments/assets/6821df79-3585-4d0c-b7f9-2170faf1105b" />
Favorite Screen : <img width="1080" height="2460" alt="FavoritesScreen" src="https://github.com/user-attachments/assets/c72dc99a-6dcf-4b6d-ba69-0762b91b429f" />
Profile Section : <img width="1080" height="2460" alt="ProfileScreen" src="https://github.com/user-attachments/assets/ac7d4851-a8dd-48d5-ae92-3c250c5dc9bc" />
Detailed Coffee Screen : <img width="1080" height="2460" alt="DetailCoffeeCardScreen" src="https://github.com/user-attachments/assets/a06a2965-1023-4c1b-8bab-9709984ae55d" />


## 🚀 Getting Started

### Prerequisites

- Android Studio
- Android SDK compatible with the project configuration
- A physical Android device or Android Emulator

### Run the Project

1. Clone this repository:

   git clone https://github.com/RSMSPN01/ModernCoffeeApp
 

2. Open the project in Android Studio.
3. Allow Gradle to sync and resolve the project dependencies.
4. Connect an Android device or start an emulator.
5. Click **Run** to build and launch the application.

## 📂 Project Structure

The project is organized around Android's standard application structure.

```
CoffeeApp/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── ... Kotlin source files
│   │       ├── res/
│   │       │   └── ... Android resources
│   │       └── AndroidManifest.xml
│   └── build.gradle.kts
├── gradle/
├── build.gradle.kts
└── settings.gradle.kts
```

*Note: The structure above is representative of a standard Android project; the exact package and source-file organization may differ.*

## 🔮 Future Improvements

- Complete and refine cart functionality.
- Implement persistent storage for cart items and liked products.
- Add a proper data layer for product information.
- Integrate a backend API for dynamic product data.
- Improve loading, empty, and error states.
- Add automated tests for important app behavior.
- Continue refining the UI and accessibility.

## 👨‍💻 About This Project

CoffeeApp is a hands-on learning project developed while exploring native Android development with Kotlin and Jetpack Compose.

My focus is on understanding the fundamentals of building real applications: designing interfaces, managing state, connecting screens, improving performance, and writing maintainable code.

**Built with ☕ and Kotlin.**

