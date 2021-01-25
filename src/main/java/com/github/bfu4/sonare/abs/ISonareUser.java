package com.github.bfu4.sonare.abs;

import java.util.UUID;

/**
 * ISonareUser - interface for managing user functions.
 *
 * @author bfu4
 * @since 25/01/2021 @ 14.01
 */
public interface ISonareUser {

   void sendMessage(String message);
   boolean isOperator();
   boolean hasPermission(String permission);
   String getName();
   UUID getUUID();

}
