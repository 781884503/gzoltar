/**
 * Copyright (C) 2018 GZoltar contributors.
 * 
 * This file is part of GZoltar.
 * 
 * GZoltar is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * GZoltar is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with GZoltar. If
 * not, see <https://www.gnu.org/licenses/>.
 */
package com.gzoltar.cli.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import com.gzoltar.cli.Command;

public class Message extends UnicastRemoteObject implements IMessage {

  private static final long serialVersionUID = 1598755164497706252L;

  private Command command = null;

  private Response response = null;

  /**
   * 
   * @throws RemoteException
   */
  public Message() throws RemoteException {
    super();
  }

  /**
   * {@inheritDoc}
   */
  public Command getCommand() throws RemoteException {
    return this.command;
  }

  /**
   * {@inheritDoc}
   */
  public void setCommand(final Command command) throws RemoteException {
    this.command = command;
  }

  /**
   * {@inheritDoc}
   */
  public Response getResponse() throws RemoteException {
    return this.response;
  }

  /**
   * {@inheritDoc}
   */
  public void setResponse(final Response response) throws RemoteException {
    this.response = response;
  }
}
