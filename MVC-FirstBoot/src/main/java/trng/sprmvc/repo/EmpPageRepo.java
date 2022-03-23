package trng.sprmvc.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import trng.sprmvc.entity.PagedEmpDetails;

public interface EmpPageRepo extends PagingAndSortingRepository<PagedEmpDetails,Integer> {

}
