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

package com.github.bfu4.sonare.commands;

import com.github.bfu4.sonare.Sonare;
import com.github.bfu4.sonare.abs.command.CommandBase;
import com.github.bfu4.sonare.abs.command.Permission;
import com.github.bfu4.sonare.abs.command.Subcommand;
import com.github.bfu4.sonare.abs.command.Usage;
import com.github.bfu4.sonare.abs.sonareobj.SonareUser;
import com.github.bfu4.sonare.commands.plugin.SonarePluginClassDumpCommand;
import com.github.bfu4.sonare.commands.plugin.SonarePluginClassMethodDumpCommand;
import com.github.bfu4.sonare.commands.plugin.SonareTogglePluginCommand;

/**
 * SonareCommandPlugins - Subcommand for managing and viewing plugin <em>code</em> properties.
 *
 * @since 25/01/2021 @ 14.14
 * @author bfu4
 */

@Usage(Sonare.COLORED_PREFIX + " &fUsage: &7/sonare plugins <list|toggle|methods|class>")
@Permission("sonare.operator.sonare.plugins")
@Subcommand
public class SonareCommandPlugins extends CommandBase {

   public SonareCommandPlugins(String commandIdentifier, Sonare plugin) {
      super(commandIdentifier, plugin);

      addSubcommand("methods", new SonarePluginClassMethodDumpCommand(plugin));
      addSubcommand("toggle", new SonareTogglePluginCommand(plugin));
      addSubcommand("class", new SonarePluginClassDumpCommand(plugin));
   }

   @Override
   public void execute(SonareUser user,  String[] args) {

   }

}
