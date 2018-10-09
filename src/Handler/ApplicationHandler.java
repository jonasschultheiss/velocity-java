//
//  ApplicationHandler.java
//  velocity
//
//  Created by Jonas Raphael Schultheiss on 05.10.18.
//  Copyright © 2018 Jonas Raphael Schultheiss. All rights reserved.
//

package Handler;
public class ApplicationHandler {
    public ApplicationHandler () {

    }

    public void Start() {
        CreateViewHandler();
    }

    private void CreateViewHandler() {
        ViewHandler viewHandler = new ViewHandler();
        //
    }

    // looks if Media folder exists. Returns a boolean value
    private boolean isFirstStart() {
        // do stuff
        return true;
    }

    private void GetAssets() {

    }
}
