/**
 * MIT License
 * <p>
 * Copyright (c) 2021 bfu4
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.bfu4.sonare.commands.plugin;

import com.github.bfu4.sonare.Sonare;
import com.github.bfu4.sonare.abs.command.CommandBase;
import com.github.bfu4.sonare.abs.command.Permission;
import com.github.bfu4.sonare.abs.command.Subcommand;
import com.github.bfu4.sonare.abs.command.Usage;
import com.github.bfu4.sonare.abs.sonareobj.SonareUser;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.plugin.Plugin;

import java.util.Arrays;

/**
 * SonarePluginClassMethodDumpCommand -
 *
 * @since 25/01/2021 @ 22.17
 * @author bfu4
 */

@Permission("sonare.operator.sonare.plugins.method")
@Usage(Sonare.COLORED_PREFIX + " &fUsage: &7/sonare plugins dump <plugin> <class>")
@Subcommand
public class SonarePluginClassMethodDumpCommand extends CommandBase {

   public SonarePluginClassMethodDumpCommand(String commandIdentifier, Sonare plugin) {
      super(commandIdentifier, plugin);

      Arrays.stream(Bukkit.getPluginManager().getPlugins()).forEach(bukkitPlugin -> {
         addValidArgs(bukkitPlugin.getName());
      });
   }

   @Override
   public void execute(SonareUser user, Command command, String identifier, String[] args) {
      if (args.length != 2) {
         user.sendMessage(getUsage());
      } else {
         try {
            Plugin plugin = Bukkit.getPluginManager().getPlugin(args[0]);
            if (plugin != null) {
               // todo better implementation for finding and feeding class names and filling in respective path c:
               Class<?> clazz = Class.forName(args[1]);
            } else {

            }
         } catch (ClassNotFoundException e) {

         }
      }
   }

}
