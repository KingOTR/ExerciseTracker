package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Handsclapping.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandsClapping", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getHandsClapping", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handsClapping", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandsclappingKt {
    private static ImageVector _handsClapping;

    public static final ImageVector getHandsClapping(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _handsClapping;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandsClapping", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(188.87f, 65.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, false, 157.62f, 83.0f);
        pathBuilder.lineTo(133.36f, 41.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, -31.22f, 18.0f);
        pathBuilder.lineTo(96.4f, 49.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, false, 65.18f, 67.0f);
        pathBuilder.lineToRelative(3.34f, 5.77f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 39.74f, 111.0f);
        pathBuilder.lineToRelative(3.0f, 5.2f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 23.5f, 155.0f);
        pathBuilder.lineToRelative(35.27f, 61.0f);
        pathBuilder.arcToRelative(80.14f, 80.14f, 0.0f, false, false, 149.52f, -39.57f);
        pathBuilder.arcTo(71.92f, 71.92f, 0.0f, false, false, 210.0f, 101.58f);
        pathBuilder.close();
        pathBuilder.moveTo(190.07f, 192.56f);
        pathBuilder.arcTo(64.12f, 64.12f, 0.0f, false, true, 72.65f, 208.0f);
        pathBuilder.lineTo(37.38f, 147.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 17.34f, -10.0f);
        pathBuilder.lineTo(75.0f, 172.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.87f, -8.0f);
        pathBuilder.lineTo(53.62f, 103.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 71.0f, 93.0f);
        pathBuilder.lineToRelative(31.81f, 55.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.87f, -8.0f);
        pathBuilder.lineToRelative(-26.0f, -45.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 17.35f, -10.0f);
        pathBuilder.lineToRelative(36.5f, 63.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.87f, -8.0f);
        pathBuilder.lineToRelative(-12.6f, -21.75f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 163.44f, 109.0f);
        pathBuilder.lineToRelative(20.22f, 35.0f);
        pathBuilder.arcTo(63.52f, 63.52f, 0.0f, false, true, 190.07f, 192.57f);
        pathBuilder.close();
        pathBuilder.moveTo(160.22f, 24.0f);
        pathBuilder.lineTo(160.22f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.lineTo(176.22f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(193.44f, 30.0f);
        pathBuilder.lineTo(201.44f, 16.9f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.68f, 8.33f);
        pathBuilder.lineToRelative(-8.0f, 13.11f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.84f, 3.83f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 193.44f, 30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(238.44f, 63.66f);
        pathBuilder.lineTo(223.39f, 68.51f);
        pathBuilder.arcToRelative(8.15f, 8.15f, 0.0f, false, true, -2.46f, 0.39f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.46f, -15.62f);
        pathBuilder.lineToRelative(15.06f, -4.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.91f, 15.23f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handsClapping = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
