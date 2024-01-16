package com.mdm.equipmentservice.model.dto.list;

import com.mdm.equipmentservice.model.dto.base.DepartmentDto;
import com.mdm.equipmentservice.model.dto.base.EquipmentDto;
import com.mdm.equipmentservice.model.dto.base.FileStorageDto;
import com.mdm.equipmentservice.model.dto.base.UserDto;
import com.mdm.equipmentservice.model.entity.TicketStatus;
import com.mdm.equipmentservice.model.entity.TransferTicket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link TransferTicket}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferTicketListDto implements Serializable {
    private Long id;

    private String code;

    private UserDto creator;

    private LocalDateTime createdDate;

    private String creatorNote;

    private LocalDateTime approvalDate;

    private String approverNote;

    private UserDto approver;

    private TicketStatus status;

    private EquipmentDto equipment;

    private DepartmentDto fromDepartment;

    private DepartmentDto toDepartment;

    private LocalDateTime dateTransfer;

    private String transferNote;
    //TODO: them tat ca attachment vao cac dto list khac nhu the nay, dong thoi tim cach toi uu query, nhu nay dang bi n+1 query, xin loi vi anh ko co du thoi gian de nghi nua roi :)
    private List<FileStorageDto> attachments;
}