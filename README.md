# AutoOppPlugin

A Spigot MC Plugin that automatically grants operator status to all players joining the server.

## Installation

Compile the plugin with maven:

    mvn clean install
    
The compile plugin is automatically copied to the target folder (`target/AutoOpPlugin.jar`). The use the plugin, copy it
to the plugins folder of your Spigot installation.

    cp target/AutoOpPlugin.jar /path/to/spigot/plugins/
    
Once the spigot server is started. All joining players are automatically granted operator status.