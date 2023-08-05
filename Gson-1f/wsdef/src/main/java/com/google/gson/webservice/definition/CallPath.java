/*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gson.webservice.definition;

/**
 * Encapsulation of a Web service path that is sent by the client.
 * 
 * @author inder
 */
public final class CallPath {

  private final String path;

  public CallPath(String path) {
    this.path = path;
  }

  public String get() {
    return path;
  }
  
  @Override
  public int hashCode() {
    return path.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    return getClass() == obj.getClass() && path == ((CallPath)obj).path;
  }
  
  @Override
  public String toString() {
    return path;
  }
}
