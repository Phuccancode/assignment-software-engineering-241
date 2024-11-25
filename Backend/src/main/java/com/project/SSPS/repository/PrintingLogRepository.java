package com.project.SSPS.repository;

import com.project.SSPS.model.PrintingLog;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface PrintingLogRepository extends JpaRepository<PrintingLog,Long> {
    Page<PrintingLog> findAll(Pageable pageable);

}