package com.sahand.setting.persistence.action;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class SystemSettingRepositoryProducer {
    // use @SuppressWarnings to tell IDE to ignore warnings about field not being referenced directly
    @SuppressWarnings("unused")
    @Produces
    @SystemSettingRepository
    @PersistenceContext(unitName="pu-setting")
    private EntityManager em;
}
