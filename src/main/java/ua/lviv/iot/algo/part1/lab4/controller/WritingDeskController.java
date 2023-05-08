package ua.lviv.iot.algo.part1.lab4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ua.lviv.iot.algo.part1.lab4.models.WritingDesk;
import ua.lviv.iot.algo.part1.lab4.service.WritingDeskService;

import java.util.List;

@RequestMapping("/writing-desks")
@RestController
public class WritingDeskController {
    @Autowired
    private WritingDeskService writingDeskService;

    @GetMapping("/get-all")
    public final List<WritingDesk> getAllWritingDesks() {
        return writingDeskService.getAllWritingDesks();
    }

    @GetMapping("/get/{id}")
    public final ResponseEntity<WritingDesk> getWritingDeskById(@PathVariable("id") final Integer id) {
        System.out.println(id);
        WritingDesk writingDesk = writingDeskService.getWritingDeskById(id);
        if (writingDesk == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(writingDesk, HttpStatus.OK);
    }

    @PostMapping("/create")
    public final WritingDesk createWritingDesk(@RequestBody final WritingDesk writingDesk) {
        WritingDesk result = writingDeskService.createWritingDesk(writingDesk);
        System.out.println(result);
        return result;
    }

    @PutMapping("/update/{id}")
    public final ResponseEntity<WritingDesk> updateWritingDeskById(@PathVariable("id") final Integer id, @RequestBody final WritingDesk writingDesk) {
        WritingDesk existingWritingDesk = writingDeskService.getWritingDeskById(id);
        if (existingWritingDesk == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        System.out.println(id);
        WritingDesk result = writingDeskService.updateWritingDeskById(id, writingDesk);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public final ResponseEntity<String> deleteWritingDesk(@PathVariable final Integer id) {
        WritingDesk existingWritingDesk = writingDeskService.getWritingDeskById(id);
        if (existingWritingDesk == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        writingDeskService.deleteWritingDeskById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
