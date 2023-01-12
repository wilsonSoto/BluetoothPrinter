import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(PrintVPlugin)
public class PrintVPlugin: CAPPlugin {
    private let implementation = PrintV()

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
