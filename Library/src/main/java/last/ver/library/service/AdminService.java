package last.ver.library.service;

import last.ver.library.dto.AdminDto;
import last.ver.library.model.Admin;

public interface AdminService {
    Admin save(AdminDto adminDto);

    Admin findByUsername(String username);
}
