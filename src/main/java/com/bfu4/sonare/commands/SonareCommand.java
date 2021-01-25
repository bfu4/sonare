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

package com.bfu4.sonare.commands;

import com.bfu4.sonare.Sonare;
import com.bfu4.sonare.abs.command.CommandBase;
import com.bfu4.sonare.abs.command.Permission;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

/**
 * SonareCommand - Sonare's main command.
 *
 * @since 25/01/2021 @ 13.55
 * @author bfu4
 */

@Permission("sonare.operator.sonare")
public class SonareCommand extends CommandBase {

   public SonareCommand(String commandIdentifier, Sonare plugin) {
      super(commandIdentifier, plugin);
      addValidArgs("help", "plugins", "listeners", "events", "execute");
   }

   @Override
   public void execute(CommandSender sender, Command command, String identifier, String[] args) {

   }

}
