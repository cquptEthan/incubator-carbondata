/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.carbondata.core.service;

import org.apache.carbondata.core.carbon.CarbonTableIdentifier;
import org.apache.carbondata.core.carbon.ColumnIdentifier;
import org.apache.carbondata.core.carbon.path.CarbonTablePath;

/**
 * Create helper to get path details
 */
public interface PathService {

  /**
   * @param columnIdentifier
   * @param storeLocation
   * @param tableIdentifier
   * @return store path related to tables
   */
  CarbonTablePath getCarbonTablePath(ColumnIdentifier columnIdentifier, String storeLocation,
      CarbonTableIdentifier tableIdentifier);
}
