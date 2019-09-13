/*
 * Copyright (c) 2019, Seqera Labs.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * This Source Code Form is "Incompatible With Secondary Licenses", as
 * defined by the Mozilla Public License, v. 2.0.
 */
import {JwtAuthData} from "./jwt-auth-data";

export interface UserData {
  id: number;
  userName: string;
  email: string;
  roles: string[];
  jwtAuthData: JwtAuthData;

  firstName: string;
  lastName: string;
  organization: string;
  description: string;
  avatar: string;
}
