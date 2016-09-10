/**
 *  MultiDoor
 *
 *  Copyright 2016 Steve Buck
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
definition(
    name: "MultiDoor",
    namespace: "softwarily",
    author: "Steve Buck",
    description: "Multi tilt monitor.",
    category: "Safety & Security",
    iconUrl: "https://lh3.googleusercontent.com/k2JIYqZKY1XLLpTCpiGnfg0HQW9hXPBF4u3GhcwX0sb1iMI_iFdnwb9hJRapMkVE-cMF8SLm=w1263-h578",
    iconX2Url: "https://lh5.googleusercontent.com/Qx_hmL5nvnA1u1B55otEgNbTQPg15iQ06L9nFv7SZoRI26nSqV9BNnH6nSWy2XqTT--zClIAoTmX-cY=w1306-h627",
    iconX3Url: "https://lh5.googleusercontent.com/Qx_hmL5nvnA1u1B55otEgNbTQPg15iQ06L9nFv7SZoRI26nSqV9BNnH6nSWy2XqTT--zClIAoTmX-cY=w1306-h627")


preferences {
	section("Title") {
		// TODO: put inputs here
	}
}

def installed() {
	log.debug "Installed with settings: ${settings}"

	initialize()
}

def updated() {
	log.debug "Updated with settings: ${settings}"

	unsubscribe()
	initialize()
}

def initialize() {
	// TODO: subscribe to attributes, devices, locations, etc.
}

// TODO: implement event handlers