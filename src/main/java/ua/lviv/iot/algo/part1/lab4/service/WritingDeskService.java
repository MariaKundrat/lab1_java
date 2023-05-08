package ua.lviv.iot.algo.part1.lab4.service;

import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.lab4.models.WritingDesk;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class WritingDeskService {
    private final Map<Integer, WritingDesk> writingDesks = new HashMap<>();
    private int nextAvailableId = 1;

    public final List<WritingDesk> getAllWritingDesks() {
        return new LinkedList<>(writingDesks.values());
    }

    public final WritingDesk getWritingDeskById(final Integer id) {
        return writingDesks.get(id);
    }

    public final WritingDesk createWritingDesk(final WritingDesk writingDesk) {
        writingDesk.setId(nextAvailableId++);
        writingDesks.put(writingDesk.getId(), writingDesk);
        return writingDesk;
    }

    public final WritingDesk updateWritingDeskById(final Integer id, final WritingDesk writingDesk) {
        writingDesk.setId(id);
        writingDesks.put(id, writingDesk);
        return writingDesk;
    }

    public final void deleteWritingDeskById(final Integer id) {
        writingDesks.remove(id);
    }
}
