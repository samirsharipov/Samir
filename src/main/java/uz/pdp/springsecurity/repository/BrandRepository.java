package uz.pdp.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.springsecurity.entity.Brand;

import java.util.List;
import java.util.UUID;

public interface BrandRepository extends JpaRepository<Brand, UUID> {
    List<Brand> findAllByBusiness_Id(UUID branch_id);

//    List<Brand> findAllByBranchId(UUID id);
//    List<Brand> findAllBy(UUID id);

}
