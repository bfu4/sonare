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

package com.github.bfu4.sonare.abs.sonareobj;

import com.github.bfu4.sonare.Sonare;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * SonareUser -
 *
 * @since 25/01/2021 @ 14.02
 * @author bfu4
 */
public class SonareUser implements ISonareUser {

   private CommandSender sender;

   public SonareUser(CommandSender sender) {
      this.sender = sender;
   }

   @Override
   public void sendMessage(String message) {
      sender.sendMessage(translateMessage(message));
   }

   @Override
   public void sendFormattedMessage(String message) {
      sendMessage(Sonare.COLORED_PREFIX + " " + message);
   }

   @Override
   public boolean isOperator() {
      return sender.isOp();
   }

   @Override
   public boolean hasPermission(String permission) {
      return sender.hasPermission(permission);
   }

   @Override
   public String getName() {
      return sender.getName();
   }

   @Override
   public UUID getUUID() {
      Player player = Bukkit.getPlayer(sender.getName());
      return player != null ? player.getUniqueId() : null;
   }

   @Override
   public Location getLocation() { return sender instanceof Player ? ((Player) sender).getLocation() : null; }

   private String translateMessage(String message) {
      return ChatColor.translateAlternateColorCodes('&', message);
   }

}
