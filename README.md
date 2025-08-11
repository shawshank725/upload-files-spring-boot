# 📂 Spring Boot File Upload with Cloudinary

A simple Spring Boot application that demonstrates **file upload** functionality using the **Cloudinary** API.
It supports uploading images and files directly to Cloudinary and returning their public URLs.

---

## 🚀 Features
- Upload files to **Cloudinary**
- Return uploaded file details (URL, type, etc.)
- Easy setup — just clone, configure, and run
- Works with any Java IDE (IntelliJ, Eclipse, VS Code)

---

## 📦 Requirements
- Java **17** or later
- Maven (or Maven wrapper included in IDE)
- Cloudinary account (for API credentials)

---

## 🔧 Setup & Run

1. **Clone the repository**
   ```bash
   git clone <your-repo-url>
   cd <your-project-folder>
   ```

2. **Add Cloudinary credentials**
   - Open `application.properties` (or `application.yml` if you use YAML)
   - Add your Cloudinary API details:
     ```properties
     cloudinary.cloud-name=YOUR_CLOUD_NAME
     cloudinary.api-key=YOUR_API_KEY
     cloudinary.api-secret=YOUR_API_SECRET
     ```

3. **Run the project**
   - Open the project in your preferred IDE
   - Run the `Main` class (the one with `@SpringBootApplication`)

4. **Test file upload**
   - Use Postman or any HTTP client
   - Send a `POST` request to:
     ```
     http://localhost:8080/upload
     ```
   - Attach a file as `multipart/form-data`.

---


