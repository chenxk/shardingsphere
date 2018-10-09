/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
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
 * </p>
 */

package io.shardingsphere.example.repository.jpa.entity;

import io.shardingsphere.example.repository.api.entity.OrderItem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "t_order_item")
public class JPAOrderItem extends OrderItem implements Serializable {
    
    private static final long serialVersionUID = 263434701950670170L;
    
    @Column(name = "order_id")
    private long orderId;
    
    @Column(name = "user_id")
    private int userId;
    
    @Id
    @Column(name = "order_item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Override
    public long getOrderItemId() {
        return super.getOrderItemId();
    }
    
    
    public long getOrderId() {
        return orderId;
    }
    
    
    public int getUserId() {
        return userId;
    }
    
    
    @Override
    public String toString() {
        return String.format("order_item_id: %s, order_id: %s, user_id: %s", orderItemId, orderId, userId);
    }
}
