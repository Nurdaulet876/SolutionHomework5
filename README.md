# Proxy Pattern
• In this scenario, the Proxy Pattern was used to solve the performance and memory consumption issue caused by immediately loading high-resolution images for a real estate agency’s website. Without the proxy, every image (even if not viewed in full) would load at high resolution, leading to longer load times, high memory usage, and poor user experience. By introducing a proxy (ImageProxy), only lightweight thumbnails are shown initially, and the full-resolution image is loaded lazily—only when the user explicitly requests it, such as by clicking on the image.

• The Proxy Pattern acted as a stand-in for the real image object (HighResImage) and controlled access to it. This added a layer of control while keeping the rest of the codebase unchanged (due to the shared Image interface). The proxy ensured that resource-intensive operations (like loading a full image) only occurred when truly necessary, significantly optimizing performance. It also made the code more maintainable and scalable: for example, logging, access control, or caching behavior can be added to the proxy without changing the HighResImage class. This separation of concerns is a core strength of the Proxy Pattern.

# Flyweight Pattern
• The Flyweight Pattern was applied to solve the memory inefficiency caused by duplicating identical style data across thousands of map markers in a mapping application. Without this pattern, each MapMarker would need to store its own copy of style attributes (type, color, labelStyle), leading to massive redundancy and memory bloat. Instead, the Flyweight approach centralizes shared state (intrinsic data) into reusable MarkerStyle objects, drastically reducing the number of objects needed in memory.

• The Flyweight Pattern decoupled shared marker style data from individual marker instances. This allowed multiple MapMarker objects to reuse the same MarkerStyle object, as seen in the factory-managed cache. As a result, the app avoids unnecessary object creation, leading to significant memory savings, especially when rendering thousands of markers. It also improves maintainability: style definitions are consistent and centralized, making it easier to update or extend styling logic. The factory pattern (MarkerStyleFactory) further encapsulates style creation and reuse logic, making the design clean, modular, and scalable.
