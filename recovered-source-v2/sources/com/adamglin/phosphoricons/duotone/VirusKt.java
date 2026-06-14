package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Virus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Virus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getVirus", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_virus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VirusKt {
    private static ImageVector _virus;

    public static final ImageVector getVirus(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _virus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Virus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 40.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, true, false, 88.0f, 88.0f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, false, 128.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 128.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(136.0f, 108.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 136.0f, 108.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(108.0f, 120.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 108.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(176.0f, 112.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 112.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(144.0f, 176.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 176.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(240.0f, 120.0f);
        pathBuilder2.lineTo(223.66f, 120.0f);
        pathBuilder2.arcToRelative(95.52f, 95.52f, 0.0f, false, false, -22.39f, -53.95f);
        pathBuilder2.lineToRelative(12.39f, -12.39f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f);
        pathBuilder2.lineTo(190.0f, 54.73f);
        pathBuilder2.arcTo(95.52f, 95.52f, 0.0f, false, false, 136.0f, 32.34f);
        pathBuilder2.lineTo(136.0f, 16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.lineTo(120.0f, 32.34f);
        pathBuilder2.arcTo(95.52f, 95.52f, 0.0f, false, false, 66.05f, 54.73f);
        pathBuilder2.lineTo(53.66f, 42.34f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 42.34f, 53.66f);
        pathBuilder2.lineTo(54.73f, 66.05f);
        pathBuilder2.arcToRelative(95.52f, 95.52f, 0.0f, false, false, -22.39f, 54.0f);
        pathBuilder2.lineTo(16.0f, 120.05f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(32.34f, 136.05f);
        pathBuilder2.arcTo(95.52f, 95.52f, 0.0f, false, false, 54.73f, 190.0f);
        pathBuilder2.lineTo(42.34f, 202.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder2.lineToRelative(12.39f, -12.39f);
        pathBuilder2.arcToRelative(95.52f, 95.52f, 0.0f, false, false, 54.0f, 22.39f);
        pathBuilder2.lineTo(120.05f, 240.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(136.05f, 223.66f);
        pathBuilder2.arcTo(95.52f, 95.52f, 0.0f, false, false, 190.0f, 201.27f);
        pathBuilder2.lineToRelative(12.39f, 12.39f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f);
        pathBuilder2.lineTo(201.27f, 190.0f);
        pathBuilder2.arcTo(95.52f, 95.52f, 0.0f, false, false, 223.66f, 136.0f);
        pathBuilder2.lineTo(240.0f, 136.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 208.0f);
        pathBuilder2.arcToRelative(80.0f, 80.0f, 0.0f, true, true, 80.0f, -80.0f);
        pathBuilder2.arcTo(80.09f, 80.09f, 0.0f, false, true, 128.0f, 208.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _virus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
