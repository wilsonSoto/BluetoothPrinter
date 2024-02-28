import Foundation

@objc public class printB: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
