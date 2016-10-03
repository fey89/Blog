package org.jhipster.blog.service.impl;

import org.jhipster.blog.service.EntryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EntryServiceImpl implements EntryService {

    private final Logger log = LoggerFactory.getLogger(EntryServiceImpl.class);

}
