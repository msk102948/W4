package com.sparta.w4.service;

import com.sparta.w4.model.FanMemo;
import com.sparta.w4.repository.FanMemoRepository;
import com.sparta.w4.dto.FanMemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class FanMemoService {

    private final FanMemoRepository fanMemoRepository;

    public List<FanMemo> memoList() {
        return fanMemoRepository.findAllByOrderByModifiedAtDesc();
    }

    @Transactional
    public FanMemo fanmemoView(Long id) {
        return fanMemoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 게시글 입니다.")
        );
    }


    public void save(FanMemoRequestDto requestDto) {
        String username = requestDto.getUsername();
        String title = requestDto.getTitle();
        String content = requestDto.getContent();

        FanMemo fanMemo = new FanMemo(username, title, content);
        fanMemoRepository.save(fanMemo);
    }
}
