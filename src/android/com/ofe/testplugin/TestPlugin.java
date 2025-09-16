
package com.ofe.testplugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
package com.ofe.testplugin;

public class TestPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("echo".equals(action)) {
            String message = args.getString(0);
            callbackContext.success("Echo: " + message);
            return true;
        }
        return false;
    }
}
