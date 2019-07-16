package _11_proxy;

// Proxy: An interface for accessing a particular resource

// A class that functions as an interface to a particular resource. That resource may be remote, expensive to construct,
// or may require logging or some other added functionality.

// =====

// Protection Proxy: A proxy that control access to a particular resource while offering the same API.

// =====

// Property Proxy: A proxy that add/do additional work whenever we access our fields/methods while offering the same
// API.
// In other languages, with capabilities of implicit conversions and/or operators overloading this become a way easier,
// but we can still do this with Java by using getters and setters.

// =====

// Dynamic Proxy: A proxy constructed at runtime (not compile time)
// + Much more Powerful
// + No need to construct specific classes to use
// - Computationally Costly!
// used by a lot of frameworks.

// =====

// Proxy VS Decorator
// Proxy provides an identical interface; Decorator provides an enhanced interface
// Decorator typically aggregates (or has reference to) what is decorating; proxy does not have to
// Proxy might not even be working with a materialized object (Dynamic Proxy)

// =====

// Summary:
// A proxy has the same interface as the underlying object
// To create a proxy, simply replicate the exciting interface of an object
// Add relevant functionality to the redefined member functions
// Different proxies (communication, logging, caching, etc.) have completely different behaviour.