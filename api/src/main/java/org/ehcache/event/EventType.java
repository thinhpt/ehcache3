/*
 * Copyright Terracotta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ehcache.event;

/**
 * @author Alex Snaps
 */
public enum EventType {

  /**
   * Represents a {@link org.ehcache.Cache.Entry} being evicted
   */
  EVICTED,

  /**
   * Represents a {@link org.ehcache.Cache.Entry} expiring
   */
  EXPIRED,

  /**
   * Represents a {@link org.ehcache.Cache.Entry} being removed
   */
  REMOVED,

  /**
   * Represents a new {@link org.ehcache.Cache.Entry} being installed for a given key
   */
  CREATED,

  /**
   * Represents an existing {@link org.ehcache.Cache.Entry} being updated for a given key
   */
  UPDATED,

}
