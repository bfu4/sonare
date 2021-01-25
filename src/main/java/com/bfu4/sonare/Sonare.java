/**
 * MIT License
 *
 * Copyright (c) 2021 bfu4
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */


package com.bfu4.sonare;

import com.bfu4.sonare.abs.SonarePlugin;
import com.bfu4.sonare.abs.command.CommandManager;
import com.bfu4.sonare.commands.SonareCommand;

import java.util.logging.Logger;

/**
 * Sonare - A multi-purpose Bukkit debugging Plugin.
 *
 * @author bfu4
 * @since 25/01/2021 @ 12.36
 */
public class Sonare extends SonarePlugin {

   public static final String COLORED_PREFIX = "&d[&eSONARE&d]&r";

   private Logger logger;
   private CommandManager manager;

   @Override
   public void onEnable() {
      manager = new CommandManager(this);
      logger = getLogger();

      registerCommands();
   }

   @Override
   public void onDisable() {

   }

   @Override
   public CommandManager getManager() {
      return manager;
   }

   private void registerCommands() {
      manager.register(new SonareCommand("sonare", this));
   }

   public Logger getLogger() { return logger; }

}
