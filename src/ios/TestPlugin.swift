
import Foundation

@objc(TestPlugin) class TestPlugin : CDVPlugin {
    @objc(echo:)
    func echo(command: CDVInvokedUrlCommand) {
        let msg = command.arguments[0] as? String ?? ""
        let pluginResult = CDVPluginResult(status: CDVCommandStatus_OK, messageAs: "Echo: " + msg)
        self.commandDelegate.send(pluginResult, callbackId: command.callbackId)
    }
}