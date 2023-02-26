package org.safinajaal.Overnet.facade;

import org.safinajaal.Overnet.dto.CommentDTO;
import org.safinajaal.Overnet.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentFacade {

    public CommentDTO commentToCommentDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(comment.getId());
        commentDTO.setUsername(comment.getUsername());
        commentDTO.setMessage(comment.getMessage());

        return commentDTO;
    }
}
