package com.equipment.equipmentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equipment.equipmentService.model.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {}
