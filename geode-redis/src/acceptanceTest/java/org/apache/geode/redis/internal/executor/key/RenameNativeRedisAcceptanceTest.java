/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.geode.redis.internal.executor.key;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import org.apache.geode.NativeRedisTestRule;

public class RenameNativeRedisAcceptanceTest extends RenameIntegrationTest {
  @ClassRule
  public static NativeRedisTestRule redis = new NativeRedisTestRule();

  @BeforeClass
  public static void setUp() {
    rand = new Random();
    jedis = new Jedis("localhost", redis.getPort(), 10000000);
    jedis2 = new Jedis("localhost", redis.getPort(), 10000000);
    jedis3 = new Jedis("localhost", redis.getPort(), 10000000);
  }

  @Override
  @Test
  @Ignore("native redis does implement renamenx")
  public void renamenxIsUnimplemented() {}
}
