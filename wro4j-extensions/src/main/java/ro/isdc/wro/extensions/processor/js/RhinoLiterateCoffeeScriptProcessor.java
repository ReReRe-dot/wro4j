//   Copyright 2015, Thilo Planz
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package ro.isdc.wro.extensions.processor.js;

import ro.isdc.wro.extensions.processor.support.coffeescript.CoffeeScript;

public class RhinoLiterateCoffeeScriptProcessor extends RhinoCoffeeScriptProcessor {
    
    public static final String ALIAS = "rhinoLiterateCoffeeScript";

    @Override
    protected CoffeeScript newCoffeeScript() {
        
        CoffeeScript s = super.newCoffeeScript();
        s.setOptions("literate");
        return s;
    }
    
}
