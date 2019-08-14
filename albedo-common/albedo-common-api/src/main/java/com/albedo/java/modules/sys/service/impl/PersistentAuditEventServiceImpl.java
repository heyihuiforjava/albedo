/*
 *  Copyright (c) 2019-2020, somewhere (somewhere0813@gmail.com).
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 * https://www.gnu.org/licenses/lgpl.html
 *  <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.albedo.java.modules.sys.service.impl;

import com.albedo.java.common.persistence.service.impl.BaseServiceImpl;
import com.albedo.java.modules.sys.domain.PersistentAuditEvent;
import com.albedo.java.modules.sys.repository.PersistentAuditEventRepository;
import com.albedo.java.modules.sys.service.PersistentAuditEventService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 审核事件 服务实现类
 * </p>
 *
 * @author somewhere
 * @since 2019/2/1
 */
@Service
public class PersistentAuditEventServiceImpl extends
	BaseServiceImpl<PersistentAuditEventRepository, PersistentAuditEvent, Long> implements PersistentAuditEventService {

}