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

    @GetMapping
    public final List<WritingDesk> getAllWritingDesks() {
        return writingDeskService.getAllWritingDesks();
    }

    @GetMapping(path = "/{id}")
    public final ResponseEntity<WritingDesk> getWritingDeskById(@PathVariable("id") final Integer id) {
        WritingDesk writingDesk = writingDeskService.getWritingDeskById(id);
        if (writingDesk == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(writingDesk, HttpStatus.OK);
    }

    @PostMapping
    public final WritingDesk createWritingDesk(@RequestBody final WritingDesk writingDesk) {
        WritingDesk result = writingDeskService.createWritingDesk(writingDesk);
        return result;
    }

    @PutMapping(path = "/{id}")
    public final ResponseEntity<WritingDesk> updateWritingDeskById(@PathVariable("id") final Integer id, @RequestBody final WritingDesk writingDesk) {
        WritingDesk existingWritingDesk = writingDeskService.getWritingDeskById(id);
        if (existingWritingDesk == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        WritingDesk result = writingDeskService.updateWritingDeskById(id, writingDesk);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public final ResponseEntity<String> deleteWritingDesk(@PathVariable("id") final Integer id) {
        WritingDesk existingWritingDesk = writingDeskService.getWritingDeskById(id);
        if (existingWritingDesk == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        writingDeskService.deleteWritingDeskById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
