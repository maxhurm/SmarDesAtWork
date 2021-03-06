# SmarDe's@Work: smartdevices-app

The Android app is mostly a stateless visualization of Data provided by the [smartdevice-gateway](../smartdevices-gateway/README.md). The SDGW dictates the SmartDevices what it should do and what it should display.

This is achived by generating the UI-Elements at Runtime based on the configuration data provided by the SDGW. See [Interface Definition](doc/interface.md) for a detailed look at the used Interface.

# Getting Started

See [Working with Code](doc/working_with_code.md) Page for more informations.

## Requirements

* It can be assumed, that a connection to the Server is always present. (Either over wlan or mobile internet) If not, the app can not be used.
* App has no Caching capabilities. All caching is done in the SDGW.
* SDGW and the SmartDevices-Middleware-Services are running in the Network

# Terms
* **DI** - Dependancy Injection: Software-Pattern to distribute and Automatate Class-Generation and 
* **SDGW** - Abbreviation for Smartdevices-gateway
* **SD** - SmartDevice
* **DeviceId** - An Identification for a specific device. The DeviceId has a general format of "{name}.{id}" (RegEx: [a-zA-Z0-9]*\.[a-zA-Z0-9]*)

# General Project structure

This projects consists of multiple submodules:
|Project|Description|
|--|--|
|**smartdevicesapp.app.phone**     | This is the Android-Phone and -Tablet App Module which contains Activites, Services and Phone/Tablet specific UI-Elements as well as the general DI setup. |
|**smartdevicesapp.app.watch**     | This is the Watch App Module which contains Activites, Services and Watch specific UI-Elements as well as the general DI setup.  |
|**smartdevicesapp.common**        | The common Module consists mostly of Utility classes.|
|**smartdevicesapp.model**         | ​​The model Module contains all Entity definitions as well as Repositories, Management-Classes and NetworkServices |
|**smartdevicesapp.service**       | ​​The service Module contains non Android specific Network Services and general definitions. |
|**smartdevicesapp.viewelements**  | The viewelements Module is a Android Library Module which is used by the .app.phone and the .app.watch App. It contains all generalized Viewelements, Viewmodels, UiComponents and Services. Additionally it holds most of the Android Resources, especially all general used drawables. |

# Used Libraries

* Dagger (DI)
* Lombok (Code Generation)
* RxJava (Async calls)
* ... (TODO)



