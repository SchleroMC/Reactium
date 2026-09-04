package org.powernukkitx.command.defaults;

import org.powernukkitx.command.CommandSender;
import org.powernukkitx.command.data.CommandParameter;
import org.powernukkitx.command.tree.ParamList;
import org.powernukkitx.command.utils.CommandLogger;

import java.util.Map;

/**
 * Restarts the server as a brand-new process (not merely re-initializing
 * the server instance inside the current JVM). Restricted to operators
 * and the console.
 */
public class RestartCommand extends VanillaCommand {

    public RestartCommand(String name) {
        super(name, "reactium.command.restart.description");
        this.setPermission("nukkit.command.restart");
        this.commandParameters.clear();
        this.commandParameters.put("default", CommandParameter.EMPTY_ARRAY);
        this.enableParamTree();
    }

    @Override
    public int execute(CommandSender sender, String commandLabel, Map.Entry<String, ParamList> result, CommandLogger log) {
        log.addSuccess("commands.restart.start").output(true);
        sender.getServer().restart();
        return 1;
    }
}
