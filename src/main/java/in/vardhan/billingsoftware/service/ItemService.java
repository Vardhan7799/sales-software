package in.vardhan.billingsoftware.service;

import in.vardhan.billingsoftware.io.ItemRequest;
import in.vardhan.billingsoftware.io.ItemResponse;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface ItemService {
    ItemResponse add(ItemRequest request, MultipartFile file);

    List<ItemResponse> fetchItems();

    void deleteItem(String itemId);
}
