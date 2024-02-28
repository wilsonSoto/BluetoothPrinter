import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(printBPlugin)
public class printBPlugin: CAPPlugin {
    private let implementation = printB()

    @objc func echo(_ call: CAPPluginCall) {
        let value = call.getString("value") ?? ""
        call.resolve([
            "value": implementation.echo(value)
        ])
    }
    @objc func blPrint(_ call: CAPPluginCall) {
        let value = "Hola"
        call.resolve([
            "value": implementation.echo(value)
        ])
    }

     @objc func testingMessage(_ call: CAPPluginCall) {
        let value = "Hola"
        call.resolve([
            "value": implementation.echo(value)
        ])
    }

    @objc func getNotifications(_ call: CAPPluginCall) {
        let value = "Hola"
        call.resolve([
            "value": implementation.echo(value)
        ])
    }
}
