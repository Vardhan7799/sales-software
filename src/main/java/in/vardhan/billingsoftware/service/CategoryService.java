package in.vardhan.billingsoftware.service;

import in.vardhan.billingsoftware.io.CategoryRequest;
import in.vardhan.billingsoftware.io.CategoryResponse;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface CategoryService {
    CategoryResponse add(CategoryRequest request, MultipartFile file);

    List<CategoryResponse> read();

    void delete(String categoryId);
}
