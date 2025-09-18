package io.github.lovrohk.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Note {
    protected float time;
    protected float y;
    protected float x;
    protected int lane;
    protected boolean hit;

    public Note(float time, int lane) {
        this.time = time;
        this.lane = lane;
        this.y = 100; // start position
        this.x = 0; // start position
        this.hit = false;
    }

    // every note must implement its own update logic
    public abstract void update(float delta, float songTime);

    // every note must implement its own draw logic
    public abstract void draw(SpriteBatch batch);

    // optional: generic hit detection
    public boolean isHit() {
        return hit;
    }

    public void hit() {
        hit = true;
    }

    public float getTime() {return time;}
    public int getLane() {return lane;}
}
