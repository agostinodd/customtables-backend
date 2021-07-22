package agostinodd.customtables.controller;

import agostinodd.customtables.models.CustomTable;
import agostinodd.customtables.services.CustomTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequiredArgsConstructor
@RestController
public class CustomTableController {

    @Autowired
    private final CustomTableService customTableService;

    @RequestMapping(value = "/tables-management/get", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @ResponseBody
    public CustomTable getCustomTable(@RequestBody Map ownerMail){
        System.out.println(ownerMail);
        CustomTable result = this.customTableService.findStammdatenTableByOwnerMail(ownerMail.get("ownerMail").toString());
        return result;
    }

    @RequestMapping(value = "/tables-management/save", method = RequestMethod.POST)
    public CustomTable saveCustomTable(@RequestBody CustomTable customTable){
        this.customTableService.saveStammdatenTable(customTable);
        return customTable;
    }

    @RequestMapping(value = "/tables-management/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity createCustomTable(@RequestBody CustomTable customTable){
        if(this.customTableService.findStammdatenTableByOwnerMail(customTable.getOwnerMail()) != null) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        this.customTableService.saveStammdatenTable(customTable);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/tables-management/exists", method = RequestMethod.POST)
    @ResponseBody
    public boolean existCustomTable(@RequestBody Map ownerMail){
        CustomTable result = this.customTableService.findStammdatenTableByOwnerMail(ownerMail.get("ownerMail").toString());
        if(result != null){
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping(value = "/tables-management/delete", method = RequestMethod.POST)
    public HttpStatus deleteCustomTable(@RequestBody Map id){
        this.customTableService.deleteStammdatenTable((String) id.get("id"));
        return HttpStatus.OK;
    }

}
