/*
 * Copyright 2014 Samuel Franklyn <sfranklyn at gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package segcounter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.deltaspike.jpa.api.transaction.TransactionScoped;

/**
 *
 * @author Samuel Franklyn <sfranklyn at gmail.com>
 */
@Singleton
public class EntityManagerProducer {

    private EntityManagerFactory emf;

    @PostConstruct
    public void start() {
        emf = Persistence.createEntityManagerFactory("segcounterPU");
    }

    @PreDestroy
    public void stop() {
        emf.close();
    }

    @Produces
    @TransactionScoped
    public EntityManager getEm() {
        return emf.createEntityManager();
    }

}
