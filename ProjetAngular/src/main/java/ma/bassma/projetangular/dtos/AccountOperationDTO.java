package ma.bassma.projetangular.dtos;

import lombok.Data;
import ma.bassma.projetangular.enums.OperationType;

import java.util.Date;


@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
